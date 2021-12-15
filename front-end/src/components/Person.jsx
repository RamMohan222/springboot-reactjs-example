function Person({ id, name, address, age }) {
    return (
        <tr>
            <td>{id}</td>
            <td>{name}</td>
            <td>{age}</td>
            <td>{address}</td>
        </tr>
    );
}

export { Person };
export default Person;